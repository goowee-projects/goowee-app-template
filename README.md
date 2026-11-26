[![Goowee on X](https://img.shields.io/twitter/follow/gooweeframework?style=social)](https://x.com/gooweeframework)

# Goowee Application Template

With [Goowee](https://goowee.org) we build Enterprise Applications with AI and [Apache Groovy](https://groovy-lang.org).

## Getting started
Make sure you have [Git](https://git-scm.com) and a [JDK](https://www.oracle.com/java/technologies/downloads/) installed. The minimum requirement is Java 21.
```
$ git clone https://github.com/goowee-projects/goowee-app-template
$ cd goowee-app-template
$ ./gradlew bootRun
```

> The first run may take a while, as all required dependencies will be downloaded.

You should see something like this:

```
>                                                                            <
>                     _ __ ___  _   _  __ _ _ __  _ __                       <
>                    | '_ ` _ \| | | |/ _` | '_ \| '_ \                      <
>                    | | | | | | |_| | (_| | |_) | |_) |                     <
>                    |_| |_| |_|\__, |\__,_| .__/| .__/                      <
>                               |___/      |_|   |_|                         <
>                                                                            <
>                Change me in /src/main/resources/banner.txt                 <
>                                                                            <

Grails application running at http://localhost:8080 in environment: development
```

Open your browser at [https://localhost:8080](https://localhost:8080) then:
- Login with `super`/`super` to manage the whole application
- Login with `admin`/`admin` to manage the `DEFAULT` tenant

![Goowee Application Login Screen](./README.png)

## New application
You can create a new application from this template project with an AI agent or manually.

### AI agent
With an AI agent execute the following prompts:

1. `Rename the application and the corresponding packages to "myapp".`
2. `Create a Goowee app to manage a “person” with the following columns: firstname, lastname, age, gender.`

### Manually
1. Find and replace the string `gooweeapp` across all project files with your chosen name
2. Rename the `gooweeapp` package accordingly
3. You can find an implementation example in the `template` package

## Create the executable `.jar`
1. Run `./gradlew bootJar`
2. The application `.jar` file will be generated under `/biuld/libs`
3. Run the application with `java -jar gooweeapp-1.0-SNAPSHOT.jar`

## Project documentation
Documentation sources are under `/src/docs`.
1. Write the content using [Asciidoc](https://asciidoctor.org/docs/asciidoc-syntax-quick-reference/)
2. Generate the documentation with `./gradlew asciidoctor`
3. The generated HTML files will be available in the `/docs` directory.

Edit this README:
- Write the content using [Markdown](https://www.markdownguide.org/cheat-sheet/)

## Learn more
- Documentation: https://goowee.org/docs

## License
Goowee is Open Source software released under the [Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.html).
