example learning from
https://dzone.com/articles/creating-jsfcdi-maven-project-on-eclipse
https://www.youtube.com/watch?v=gaDgR5QbJSE
http://www.codedata.com.tw/java/javaee-cdi/

1. File => New => Maven Project => Package => war
2. Finished
3. Add pom.xml <build> for java 1.6 up
4. Project (right click) => Maven => Update Project...
5. Project (right click) => Properties => Project Facets => Dynamic Web Module 3& JavaServer Faces 2.2
6. JavaServer Faces (more configuration)
7. Generate web.xml ...
8. JSF Implementation Library => Download Library... => JSF
9. JSF Implementation Library => JSF (check) + Include libraries with this application (check)
10. Finished
11. pom.xml (right click) => Dependencies => Add... => inject & jsf-api & servlet-api & cdi-api
12. Finished
