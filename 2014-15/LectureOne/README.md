Lecture One - Using git to Make Your Life Easier
------------------------------------------------

The notes and "exercise" for our first CompSoc lecture on 29/10!

This will be updated as the time approaches with more of my notes and the important git commands you should know about.

The "exercise" (obviously non-compulsory, but it will be a way for you to check that you've understood everything fine) is stored in ATTENDEES.md.

Notes
-----

### How git Is Used ###

git is usually used through a terminal. GUIs exist, but vary in quality and can often obscure what's actually happening when you use git, which in turn means you can't take advantage of some of its best features, e.g. branching! My advice is to learn to use the command line first, and then move to a GUI (I personally quite like the Eclipse plugin EGit) after you understand the command line.

git commands always come in the same form:

    git <command> <options>

For example, to push your changes to a server you might write `git push` (don't worry about what that actually means for now; you'll understand it later!).

### Basic Commands ###

There are a few basic commands that you really need to know to be able to use git effectively. There are definitely a lot more commands available than just these, but to keep it simple I'll stick to these:

- `git clone <URL>` - Clones a repository hosted at `<URL>`. For example, to clone this repository you'd write `git clone https://github.com/UoLCompSoc/LectureOne`.

- `git status` - Shows you what's changed since the last commit. The output can seem a bit overwhelming, but when you understand more about git you'll understand how informative this command can be.

- `git add <file>` - Adds a file so that when you next commit, changes will be preserved. To start with you should do this for every file you change; there are shortcuts too. For example, if I change both README.md and LICENSE I might write    
`git add README.md LICENSE`

- `git commit` - &quot;Commit&quot; your changes since the last version. This doesn't mean they're saved online, only on your local machine. Usually you'll not want to call just `git commit` on its own, because you should be writing commit messages. For example, when I change this file (README.md) I might write:    
`git commit -m"Update README.md with new lecture notes"`.

- `git push <where> <branch>` - &quot;Pushes&quot; your changes online to a remote repository, onto a given branch. Usually you'll write something like `git push origin master` but given that this is the default you can write `git push` as a shortcut.

- `git pull <where> <branch>` - &quot;Pulls&quot; changes from a remote repository onto your local repository. Useful when collaboarating on a team project.

- `git log --pretty=oneline -<num>` - Shows *num* lines from your log; this equates to your last *num* commits. `--pretty=oneline` is my favourite formatting option for the increased readability it provides. There are a tonne more options for displaying various things.

### More Commands ###
As I said before, the above isn't anywhere near an exhaustive list of commands. Also very important 
are `git branch`, `git rebase`, `git fetch` and `git merge`.

If you have a subversion repository and you can't change the repository to git, there is an interface
called `git svn` that allows you to use git locally and push to your svn repo. That's out of the scope
of this lecture, but you can find out more in the git help pages.

### Further Reading ###

####The git Book####
Without a shadow of a doubt, the absolute best resource for learning git is the free ebook available at http://git-scm.com/book which contains basically everything you need to know. I'd reccommend reading at least chapters 1-3 (inclusive) and after that you should know most of the important stuff about using git.

####man git####
For details on specific commands, you can either run `man git` at a terminal, or run the commands with `-h` for a quick overview or `--help` for a detailed description. For example, to get details information about the commit command you'd write    
`git commit --help`.

####Where Next?####
The rest of your learning is probably going to happen through trial and error. Don't worry too much about messing up because it's actually quite hard to delete something permanently in git.

##### More To Come #####
