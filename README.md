# grails332-stylesheet-issue
Grails app for exhibiting a Grails 3.3.2 stylesheet defect.

## Installation Notes
You may use the `setup.sh` file to customize your environment with respect to Grails, Gradle and Java versions.
In a Bash shell, say `. setup.sh` to make the settings take effect.
Feel free to use any other mechanism to set up the desired environment.

## Start the App
Start the app by invoking the Grails command line. Then:
```bash
clean
run-app
```
The output will end with `Grails application running at http://localhost:8080`

## Check the Test Case
Point a web browser to `http://localhost:8080`
The database is initialized with a Ping that has a number of Pongs.
The initial view is a list of Pings.
There is only one.
Move the pointer to the first (and only) item in the list.

Note how identical background and foreground colors make contents disappear.
That's all.
