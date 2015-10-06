# Introduction to Linux


## What is Linux?
Linux is an alternative to the Windows operating system. It comes in lots of different versions and the version that we use here at university is called **Ubuntu**


## Basic Overview of Ubuntu
### The Dock
The bar on the left hand side of the screen contains a list of some of your most used and favourited applications


### The Dash
This can be openned by clicking the top icon in the dock
This interface allows you to search through all of your installed applications
*Open the dash and search for the terminal application and open it*


### The Terminal
This program presents you with a command line interface that allows you to execute commands on your machine


## Linux File Structure
### Where is the C:\ drive?
In Linux there are no labels attached to drives of the computer, so there is no C:\ or D:\ or E:\ drive. Instead Linux has a filesystem that starts with just a /
Beneath this root / you can have any number of files/directories.


### Files and Directories
Everything in linux is stored as a file or a directory. This includes any internal and external devices attached to the computer, for example, internal hard drives are stored as /dev/sda, /dev/sdb, /dev/sdc.


### Home Directory
The most relavent one to you is the /home/<username> directory, however on the University machines the home directory is the /s_home/<username> directory


## Terminal Commands
### pwd
This command prints the **P**resent **W**orking **D**irectory, so if you have just openned your terminal and you run this command, the text printed out should be /s_home/<username>

Any command executeed in the terminal will be executed relative to your present working directory.


### ls
This command lists the files/directories that are contained in the present working directory. If you run this command in your terminal now, it should print something similar to:
.
..
Desktop
Downloads
public_html

Currently this command will only print the files and directories, however you can pass a flag to the ls command.

Use can use this command to list all of the files and folders including those hidden and special files/folders.
ls -a


### Special Directories
Normally directories are named using a mixture of alpha and numeric characters. However, there are some special cases.
The ./ directory is a directory that points to the present working directory.
The ../ director is a directory that points to the parent of the current working directory.


### cd
This command allows you to change the present working directory.
Example:
$pwd
/s_home/as784/
$cd public_html
$pwd
/s_home/as784/public_html/

You can also use the special directory names, the ../ is commonly used to move one director up. Example:
$pwd
/s_home/as784/public_html/
$cd ..
$pwd
/s_home/as784/


### mkdir
This command allows you to create a directory relative to the present working directory. Example:
$ls
Documents
Downloads
public_html
$mkdir lectures
$ls
Documents
Downloads
lectures
public_html


### touch


### mv


### cp


### rm



