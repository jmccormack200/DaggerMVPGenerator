# Dagger MVP Generator 

A tool for assisting in creating new screens in Android Projects using Dagger.

## Usage

python templates.py <NameOfScreen>

## Output

This will create a folder called <NameOfScreen> filled with the following files:
1. <filename>Activity.java
2. <filename>Contract.java
3. <filename>Presenter.java
4. <filename>Injecotr.java
5. <filename>Scope.java

It is then necessary to move these files into your project and ensure the imports are handled properly. 
