package books.service

import grails.converters.*
import books.service.Book

class BooksController {

    def list() { 
    	render Book.list() as JSON
    }
    
    def retrieve() {
    	Book book = Book.get(params.id)
    	
    	render book as JSON
    }
    
    def create() {
    	Book book = new Book(request.JSON)
    	book.save();
    	
    	render book as JSON
    }
    
    def update() {
    	render "Updated"
    }
    
    def delete() {
    	render "Delete"
    }
}
