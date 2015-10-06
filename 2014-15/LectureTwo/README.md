LectureTwo
==========

How to make modern, extensible, fast games using ECS frameworks.

Links from Slides
-----------------

These are all the links that are mentioned in the slides, for your convenience.

- The best description of how ECS frameworks work, conceptually:   
http://gamedev.stackexchange.com/questions/31473/role-of-systems-in-entity-systems-architecture

- The game that was mentioned, Tesseract:   
https://github.com/UoLCompSoc/Tesseract

- The original Ashley, along with a wiki describing how it works, and all the code:   
https://github.com/libgdx/ashley

- The standalone clone of Ashley (changed to not depend on LibGDX but not supported; for your own projects, use the original above):   
https://github.com/UoLCompSoc/ashley

- A free online book, Game Programming Patterns, which explains component-based design and the evolution of the idea over time, including a simplified but far less nuanced and modifiable version of the design. Also contains many other cool ideas about making good games:   
http://gameprogrammingpatterns.com/contents.html

- The site “Data Oriented Design” which basically spawned the idea of ECS frameworks. Long and technical but a good read if the topic interests you:   
http://www.dataorienteddesign.com/dodmain/

- Ludum Dare, the game jam we'll be entering!   
http://ludumdare.com/compo/

Compiling and Running
---------------------

To compile on the command line, use the following in the LectureTwo base directory:

    javac -cp ./lib/ashley-1.3.2.jar:. -d bin/ src/*.java

To run on the command line:

    java -cp ./bin/:./lib/ashley-1.3.2.jar Main

