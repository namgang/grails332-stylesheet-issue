#
# Set up environment
#
export JAVA_HOME=/usr/lib/jvm/java-8-oracle
export GRADLE_HOME=/usr/local/gradle-4.4.1
export GRAILS_HOME=/usr/local/grails-3.3.2
export GROOVY_HOME=/usr/local/groovy-2.4.12

export CP=build/classes/main

alias gradle="$GRADLE_HOME/bin/gradle --console=plain"
#alias grails="$GRAILS_HOME/bin/grails --non-interactive --plain-output"
alias grails="$GRAILS_HOME/bin/grails --non-interactive"
alias groovy="$GROOVY_HOME/bin/groovy"
alias groovyConsole="$GROOVY_HOME/bin/groovyConsole"

export EDITOR=emacs
