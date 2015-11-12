# Introduction to Linux

---

## What is Linux?
Linux is an alternative to the Windows operating system. It comes in lots of different versions and the version that we use here at university is called **Ubuntu**.

Ubuntu is a piece of free and open source software that we highly recommend that you get familiar with, as you will be using it on a day to day basis whilst you're in labs.
 
---

## Open Source Software
Open source software is computer software that has made it's source code available so that you may look at it, modify it and redistribute it, in accordance with the license distributed with the code. An example is the GPL (GNU General Public License), granting you the right to do almost anything with the software as long as you include the original license and make your source code open as well.

---

## Advantages of Ubuntu

- Easy to install along side your already existing Windows install, giving you a great programming environment that is very similar to the University's but still with easy access to your existing files.

- Very customisable; don't like the applications installed? Change them! You don't like the ways the applications are displayed on screen? Change your display manager. Almost anything and everything is customisable.

---

## Basic Overview of Ubuntu

We will be using the Unity User Interface in all of the demonstrations and descriptions as it's the default on the university computers. That said, we suggest you also play with others to see what you like; both "Gnome" and "XFCE" are available in labs too.

---

### The Dock
The bar on the left hand side of the screen contains a list of your applications that are locked to it; you can lock any application to this dock.

![Screen shot of Ubuntu Desktop](http://imgur.com/4JerWEv.png)

---

### The Dash
This interface allows you to search through all of your installed applications.

It can be opened by clicking the icon at the top of the dock.

![Screen shot of Ubuntu Dash](http://imgur.com/Liqtcde.png)

---

### The Terminal
This application presents you with a command line interface that allows you to execute commands on your machine.

You should try to become familiar with the Terminal as it plays an important part in software development, and will be used heavily during your degree. 

Shortcut: Ctrl + Alt + T

![Screen shot of Terminal](http://imgur.com/4cIiDip.png)
---

## Linux File Structure

---

### Where is the C:\ drive?
Linux has a tree structure, similar to that of Windows machines.

In Linux there are no labels attached to drives of the computer, so there is no C:\ or D:\ or E:\ drive. 

Instead Linux has a filesystem that starts with just a '/' (the "root directory")

Beneath this '/' at the top of the tree, you can have any number of files/directories.

---

Example:
```console
/
/dev/
/dev/sda
/dev/sdb
/home/
/home/<username>
/tmp/
```

Everything in linux is stored as a file or a directory. This includes any internal and external devices attached to the computer, for example, internal hard drives are usually stored as /dev/sda, /dev/sdb, etc.

---

### Home Directory
The most relevant directory to you is probably your home directory, which usually has the path /home/&lt;username&gt;, however on the University machines the home directory is located at /s_home/&lt;username&gt;/

This is where all of your documents are stored and where you will do all of your work for University.
This is very similar to the C:\Users\&lt;username&gt; directory on Windows.

---

### Special Files and Directories
Normally directories are named using a mixture of alpha and numeric characters. However, there are some special cases.

Any file or directory prefixed with a '.', like the '.mozilla' directory or the '.bashrc' file will be hidden by default in the file browser.

The . directory is a directory that points to the present working directory.

The .. directory is a directory that points to the parent of the current working directory.

---

## Terminal Commands

In the terminal you type commands to execute programs, often with extra arguments added.

---

### pwd Command
This command prints the **P**resent **W**orking **D**irectory, so if you have just opened your terminal and you run this command, the text printed out should be /home/&lt;username&gt;/

Any command executed in the terminal will be executed relative to your present working directory.

Example:
```console
$pwd
/home/<username>/
```

---

### ls Command
This command lists the contents of the present working directory. If you run this command in your terminal now, it should print something similar to:

Example:
```console
$ls
./
../
Desktop/
public_html/
```

Currently this command will only print the files and directories, however you can pass extra options to a command, which are called flags.

---

Use can use the ls command with the 'a' flag to list all of the files and folders including those hidden and special files/folders.

Example:
```console
$ls -a
./
../
.bashrc
.mozilla
Desktop/
public_html/
```

---

Use can use the ls command with the 'l' flag to display more details about the files/folders in the present working directory.

Example:
```console
$ls -l
./
../
Desktop/
public_html/
```

---

You can also list the contents of a given directory: 

Example:
```console
$ls Downloads
first_download.pdf
second_file.txt
```

---

### cd Command
This command allows you to change the present working directory.
Example:

```console
$pwd
/home/as784/
```

```console
$cd public_html/
```

```console
$pwd
/home/as784/public_html/
```

---

You can also use the special directory names: ../ is commonly used to move one directory upward, to the parent of the current folder. Example:

```console
$pwd
/home/as784/public_html/
```

```console
$cd ..
```

```console
$pwd
/home/as784/
```

---

### mkdir Command
This command allows you to create a new directory relative to the present working directory. Example:

```console
$ls
Downloads/
public_html/
```

```console
$mkdir Lectures
```

```console
$ls
Downloads/
Lectures/
public_html/
```

---

### touch Command
This command creates a new file with the given name. Example:

```console
$ls
Downloads/
Lectures/
public_html/
```

```console
$touch oldlecture
```

```console
$ls
Downloads/
Lectures/
oldlecture
public_html/
```

---

### mv Command
This command moves the specified file/directory to the specified new location.

```console
$ls
Downloads/
Lectures/
oldlecture
public_html/
```

```console
$mv oldlecture Lectures/
```

```console
$ls
Downloads/
Documents/
Lectures/
public_html/
```

```console
$ls Lectures/
oldlecture
```

---

### cp Command
This command can be used to make a copy of a file or directory. Example:

```console
$cd Lectures
```

```console
$ls
oldlecture
```

```console
$cp oldlecture newlecture
```

```console
$ls
oldlecture
newlecture
```

---

### rm Command
This command can be used to remove files/directories. Example:

This command is **dangerous**. It does not send files/folders to the trash it simply deletes them permanently.

Running 'rm' at University will ask you for each file if you want to remove the file.


```console
$ls
newlecture
oldlecture
```

```console
$rm oldlecture
```

```console
$ls
newlecture

```

---

### grep Command

grep is a utility that allows you to search through plain text for lines matching your search pattern.

Example: This command will extract all of the lines that contain the word apple.

```console
$grep apple fruitlist.txt
```

The grep command accepts any Regular Expression as it a search term, which makes it extremely powerful.

---

## Shell Operators

Shell operators are symbols that affect the commands executed in the terminal.

They can be used to combine and chain commands or the combine and chain the results from commands.

---

### Pipes

The idea of pipes is to be able to combine commands and chain them to achieve complex tasks.

Commands take input from the terminal and output the results fo the command.

We can use the pipe character '&amp;' to send the output of one command, to the input of another command.

Example: This command will take the list of files and search that list for any file containing the word 'example'.

```console
$ ls | grep e
Documents/
Lectures/
```

---

### Control Operators

Commands as well as having an output that your see, they also output an exit status. 
If the program exits normally this code is 0.

Control operators are used to affect whether or not commands will be run.

---

#### &amp;&amp; Operator

The '&amp;&amp;' operator will execute the first command and if the command is successful the following command will be run.

Example: 

```console
$false && echo 'It worked' 
```

```console
$true && echo 'It worked' 
It worked
```

---

#### &#124;&#124; Operator

It works similar to the &amp;&amp; operator, but instead only works when the the exit status is not 0.

```console
$false || echo 'It worked' 
```

```console
$false || echo 'It worked' 
It worked
```

---

### Redirection Operators

Use can use the operators &gt; and &lt; to redirect the output from a command to file.

Example: Store the result of the 'ls' command in the file 'list.txt'
```console
$ls > list.txt
```

Example: Store the result of the 'ls' command in the end of the file 'list.txt'
```console
$ls >> list.txt
```
