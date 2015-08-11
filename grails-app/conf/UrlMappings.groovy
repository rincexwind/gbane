class UrlMappings {
	static excludes = ["/images/*", "/css/*", "/js/*"]
	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        //"/"(view:"/index")
		"/"(controller:"admin", action:"home")
        "500"(view:'/error')
		
		"/**"(controller:"admin", action:"home") 
	}
}
