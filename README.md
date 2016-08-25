example learning from
https://dzone.com/articles/creating-jsfcdi-maven-project-on-eclipse
https://www.youtube.com/watch?v=gaDgR5QbJSE
http://www.codedata.com.tw/java/javaee-cdi/

Soulution 1: 1. File => New => Dynamic Web Project 2. Configuration => Modify... => JavaServer Faces (check) 3. Generate web.xml ... 4. JSF Implementation Library => Download Library... => JSF 5. JSF Implementation Library => JSF (check) + Include libraries with this application (check) 6. Finished

Your Project => WebContent (right click) => New => HTML File => hello-world.xhtml => New Facelet Template
Finished
Solution 2: 1. File => New => Maven Project => Next 2. Packaging => war 3. Finished 4. New => src/main/webapp/WEB-INF/web.xml cont. 5. pom.xml => Dependencies => Add... => javax.faces-api 6. Solution 1-6
