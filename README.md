Project: GitHubCopilot

Package root: s27967
Subpackages: q1 (contains Main.java)

Main class: s27967.q1.Main

Compile (from project root, Windows PowerShell):
javac -d out src\s27967\q1\Main.java

Run:
java -cp out s27967.q1.Main

Notes:
- All program output is prefixed with the student ID: 27967
- Java source files are arranged under src\s27967\q1 to match the package declaration

Git & GitHub push instructions (student ID must be the GitHub username and the repository name):
1) Initialize git (if not already):
   git init
   git branch -M main
   git add .
   git commit -m "Initial commit: s27967 assignment structure"

2) Create a repository on GitHub named exactly: 27967
   - Web UI: Go to https://github.com/new, set repository name to 27967, do not initialize with README
   - OR use GitHub CLI (optional): gh repo create 27967 --public --source=. --remote=origin --push

3) Add remote and push (replace <username> with your GitHub username which must be 27967):
   git remote add origin https://github.com/<username>/27967.git
   git push -u origin main

Submission:
- The class monitor will provide a Google Form. Submit your student ID (27967) and the link to your GitHub repository (https://github.com/<username>/27967)

Grading note:
- Ensure the project name, package structure, output prefix, GitHub username/repo name follow the assignment rules to avoid penalties.

