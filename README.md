# Java Solutions

This repository contains Java solutions for various coding problems.

## Project Structure

```
paperflite/
├── problem_1/
│   ├── brute_force.java
│   ├── approach1.java
│   └── approach2.java
├── problem_2/
│   ├── brute_force.java
│   └── optimal.java
├── problem_3/
│   ├── brute_force.java
│   └── optimal.java
└── README.md
```

## Running Locally

### Prerequisites
- Java Development Kit (JDK) installed on your machine
- You can check by running: `java -version` and `javac -version` in terminal

### How to Run

1. **Compile the Java file:**
   
```
bash
   javac problem_1/brute_force.java
   
```

2. **Run the compiled class:**
   
```
bash
   java problem_1.brute_force
   
```

   Note: Use `.` instead of `/` for package structure, and don't include the `.class` extension.

### Examples

**To run problem_1/brute_force.java:**
```
bash
javac problem_1/brute_force.java
java problem_1.brute_force
```

**To run problem_2/optimal.java:**
```
bash
javac problem_2/optimal.java
java problem_2.optimal
```

**To run problem_3/optimal.java:**
```
bash
javac problem_3/optimal.java
java problem_3.optimal
```

## Running from GitHub

### Option 1: Clone and Run

1. **Clone the repository:**
   
```
bash
   git clone https://github.com/Anuja-Fernando/assignment/.git
   
```

2. **Navigate to the project directory:**
   
```
bash
   cd assignment
   
```

3. **Compile and run as shown above:**
   
```
bash
   javac problem_1/brute_force.java
   java problem_1.brute_force
   
```

### Option 2: Using GitHub Codespaces

1. Go to your GitHub repository
2. Click on "Code" button
3. Select "Codespaces" tab
4. Click "Create codespace on main"
5. Once the codespace opens, run the Java files as shown above

### Option 3: Using GitHub Gist (for single files)

1. Create a GitHub Gist with your Java code
2. Copy the raw URL of the gist
3. Use `wget` or `curl` to download and run:
   
```
bash
   wget -O Main.java https://gist.githubusercontent.com/.../raw/main.java
   javac Main.java
   java Main
   
```

## Notes

- Each Java file has a `main` method and can be run independently
- The programs will prompt for user input when run
- Make sure to compile before running

