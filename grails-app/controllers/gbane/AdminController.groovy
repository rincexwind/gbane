package gbane

class AdminController {
	
	static defaultAction = "dashboard"
	
	def adminService
	
	def home() {
		render "<h1>This will be the admin page</h1>"
	}
	
	def dashboard() {
		
		def randomQuote = adminService.getRandomQuote()
		
		[quote : randomQuote]
	}
	

	
}
