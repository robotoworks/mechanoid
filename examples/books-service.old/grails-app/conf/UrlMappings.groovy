class UrlMappings {

	static mappings = {
	   "/books"(controller:"books") {
	       action = [GET:"list", POST:"create"]
	   } 
	   
	   "/books/$id"(controller:"books") {
	       action = [GET:"retrieve", PUT:"update", DELETE:"delete"]
	   }
	    
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
