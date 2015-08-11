package gbane

import grails.converters.JSON

class AdminController {
	
	static defaultAction = "dashboard"
	
	def adminService
	
	def home() {
		response.status = 500
		def errorMsg = [error: 'an error occurred']
		render errorMsg as JSON
	}
	
	def dashboard() {
		
		def randomQuote = adminService.getRandomQuote()
		
		[quote : randomQuote]
	}
	
	def ajaxRandom() {
		def randomQuote = adminService.getRandomQuote()
		render {
			q(randomQuote.content)
			p(randomQuote.author)
		}
	}
	

	
}
