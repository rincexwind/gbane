package gbane

class AdminController {
	
	static defaultAction = "dashboard"
	
	def home() {
		render "<h1>This will be the admin page</h1>"
	}
	
	def dashboard() {
		
		def allQuotes = Behavior.list()
		def randomQuote
		if(allQuotes.size() > 0) {
			
			def randomIdx = new Random().nextInt(allQuotes.size())
			
			//randomQuote = new Behavior(author: "anonymouse",content: "index was: ${randomIdx}")
			randomQuote = allQuotes[randomIdx]
		}else  {
			randomQuote = new Behavior(author: "anonymouse",content: "real programmers ...")
		
		}
		
		[quote : randomQuote]
	}
	

	
}
