package grails332.stylesheet.issue

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller:'ping', action:'index')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
