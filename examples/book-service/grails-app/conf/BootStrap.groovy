import book.service.Book


class BootStrap {

    def init = { servletContext ->
		new Book(title:"Musashi", author: "Aiji Yoshikawa").save()
		new Book(title:"A Still Forest Pool", author: "Achaan Chah").save()
	
    }
    def destroy = {
    }
}
