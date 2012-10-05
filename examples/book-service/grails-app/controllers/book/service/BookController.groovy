package book.service

import grails.converters.JSON
import org.springframework.dao.DataIntegrityViolationException

class BookController {

    def list() { 
    	def books = Book.list()
		
		render(contentType: "text/json") {
			array {
				for(b in books) {
					book(
						id:b.id,
						title:b.title,
						author:b.author
					)
				}
			}
		}
		render book as JSON
    }
    
    def retrieve() {
    	Book book = Book.get(params.id)
    	
		render(contentType: "text/json") {
			id = book.id
			title = book.title
			author = book.author
		}
    }
    
    def create() {
    	Book book = new Book(request.JSON)
    	book.save();
    	
		render(contentType: "text/json") {
			message="Qux"
			book_id=book.id
			success=true
		}
    	render book as JSON
    }
    
    def update() {
		Book book = Book.get(params.id)
		book.properties = request.JSON
		book.save();
		
		render(contentType: "text/json") {
			message="Qux"
			book_id=book.id
			success=true
		}
    	render book as JSON
    }
    
    def delete() {
		Book book = Book.get(params.id)
		book.delete();
		
		render(contentType: "text/json") {
			message="Qux"
			book_id=book.id
			success=true
		}
    	render book as JSON
    }
}
