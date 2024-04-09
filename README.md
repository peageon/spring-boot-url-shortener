## How to execute

1. Navigate to urlshortener directory and execute docker container by running the command "docker-compose up".
<br />This will run the docker-compose.yml which runs a Redis image from docker hub.
2. Start the server
3. Make a http Post request with JSON body containing "url" as key and the url you want shortened as its value.
<br/> This will return shortened url.
4. Now take the shortened url and make a http Get request to the server.
<br /> Ex. http://localhost:8080/{shortened_url}

<br />
<br />

### Post Request
<img width="939" alt="image" src="https://github.com/peageon/spring-boot-url-shortener/assets/33882299/7b32f699-817d-4063-86d5-4f222106bbf4">

### Get Request
<img width="915" alt="image" src="https://github.com/peageon/spring-boot-url-shortener/assets/33882299/000f8a8f-0c52-47d1-9f06-82b9e935f3a0">
