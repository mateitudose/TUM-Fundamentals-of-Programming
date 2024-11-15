#!/bin/bash

# Ensure we are in the parent repository
if [ ! -d .git ]; then
  echo "This script must be run from the root of a Git repository."
  exit 1
fi

# Loop through all subfolders
for folder in */; do
  # Check if the subfolder is a Git repository
  if [ -d "$folder/.git" ]; then
    echo "Processing submodule: $folder"

    # Navigate to the submodule folder
    cd "$folder" || { echo "Failed to enter $folder"; exit 1; }

    # Remove the .git folder (detach the submodule)
    echo "Removing .git directory from $folder"
    rm -rf .git

    # Return to the parent repository
    cd - > /dev/null || exit

    # Stage the folder as part of the parent repository
    git add "$folder"
    echo "Added $folder to parent repository"

  else
    echo "Skipping $folder (not a Git repository)"
  fi
done

# Commit the changes
echo "Committing changes to the parent repository..."
git commit -m "Flatten submodules into parent repository"

echo "All done! Don't forget to push your changes."

