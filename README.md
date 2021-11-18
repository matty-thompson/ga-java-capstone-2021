# paypal-java-capstone-project

# Alexa Skill: CongressWatch

## Before Getting Started

Our original idea for the project was to build an Alexa skill that would give daily briefings on bill dockets and
results. To do this we had to research not only how to build an Alexa skill, but also how to utilize a 3rd party API to retrieve
the information.  

After reviewing a few sites we settled on ProPublica.org as they appear to be the main API source for other sites. We
were able to aquire an API key. Initial research in how to utilize a 3rd party API with a key was difficult as we were unable to get the site to accept
the key.  

We decided to build a test Alexa skill where we could get everything working with an open API key. We highly suggest reviewing this project to familiarize yourself with Amazon's Alexa Developer console and AWS Lambda tool. This is the link to our repository and additional ReadMe for this app.

https://git.generalassemb.ly/matthompson/cat-facts-test

## Technologies Used
| Postman | <img src="https://www.postman.com/assets/logos/postman-logo-stacked.svg" alt="Postman" width="150"/> |
| :------- | :-------: |
| __Alexa Skills Kit__ | <img src="https://d3ogm7ac91k97u.cloudfront.net/content/dam/alexa/alexa-brand-guidelines-2021-refresh-/Alexa_Logo_RGB_BLUE.png" alt="Alexa Skills Kit" width="300"/> |





## User Stories

## ERD Diagram

## Getting Started
• Create Project using Spring Initializer, add Spring Web, Rest, and Spring DevTools to dependencies. We are using maven for this project.  
• We set up our API information in the application.properties folder. We decided to focus on retrieving only one piece of information from ProPublica, as we can replicate successful code easily. This is our steps from start to finish for one piece of information. 

### Setup the API Credentials
We used a tutorial on RapidAPI's website called [How To Use an API with Spring RestTemplate](https://rapidapi.com/blog/how-to-use-an-api-with-spring-resttemplate/) to begin our project. 

This tutorial uses an API key that retrieves COVID data. We quickly realized we would have to create a RestClient class for each request we plan in making to the API. We decided to request Senate Member data as our first run through. Our plan was to direct Alexa to retrieve a single fact about a Senator as a base test. Then, we can go and customize the information we want to return. 

### Setup RestClient
Talk about binding errors, used [SLF4J Multiple Binding Error](http://www.slf4j.org/codes.html#multiple_bindings) 
