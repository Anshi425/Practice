FROM openjdk:11
WORKDIR /app  
COPY sum.java /app
RUN javac sum.java
CMD ["java", "sum"]