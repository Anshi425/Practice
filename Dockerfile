FROM openjdk:11
WORKDIR /app  
COPY Factorial.java /app
RUN javac Factorial.java
CMD ["java", "Factorial"]