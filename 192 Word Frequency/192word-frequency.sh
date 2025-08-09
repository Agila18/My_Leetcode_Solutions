# Read from the file words.txt and output the word frequency list to stdout.
#!/bin/bash

# Check if words.txt exists
if [[ ! -f "words.txt" ]]; then
    echo "Error: words.txt not found!"
    exit 1
fi


tr -s ' ' '\n' < words.txt |       # Replace spaces with newlines
sort |                             # Sort words
uniq -c |                          # Count occurrences
sort -nr |                         # Sort by frequency (descending)
awk '{print $2, $1}'               # Output format: word count
