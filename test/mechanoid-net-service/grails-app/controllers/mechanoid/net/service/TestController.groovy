package mechanoid.net.service

import grails.converters.JSON

class TestController {

    def stringArray() { 
		render '["lorem", "ipsum", "dolor"]'
	}
	
    def intArray() { 
    	render '[1, 3, 5]'
    }
	
    def longArray() { 
    	render '[1, 3, 5]'
    }
	
    def doubleArray() { 
    	render '[1.1, 2.3, 3.5]'
    }
	
    def booleanArray() { 
    	render '[true, false, true]'
    }
	
	def enumArray() {
		render '["monday", "tuesday", "wednesday", "thursday", "friday"]'
	}
	
	def item() {
		Item item = new Item(a:"lorem", b:5, c:100, d:1.4d, e:true)

		render item as JSON
	}
	
	def nodes() {
		render """
		[
		{
			"name":"a",
			"children": [
				{
					"name":"b"
				},
				{
					"name":"c"
				}
			]
		},
		{
			"name":"d",
			"children":[]
		}
		]
		"""
	}
	
	def echoParams() {
		render """["$params.a", "$params.b", "$params.c", "$params.d", "$params.e"]"""
	}
	
	def skipping() {
		render """
		{
			"outer":{
				"inner":{
					"a":"lorem",
					"b":3,
					"c":42
				}
			}
		}
		"""
	}
	
	def ab() {
		render """
		{
			"name":"I am A",
			"b": {
				"name": "I am B",
				"a": {
					"name": "I am another A"
				}
			}
		}
		"""
	}
	
	def echoJson() {
		render request.JSON
	}
	
	def echo() {
		render request.getReader().readLine()
	}
}
