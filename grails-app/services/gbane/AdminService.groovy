package gbane

import grails.transaction.Transactional

@Transactional
class AdminService {

    def getStaticQuote() {
		return new Behavior(author:"Anonymouse",content:"this is the static quote")
    }
	
	def getRandomQuote() {
		
		def allQuotes = Behavior.list()
		def randomQuote = null
		if(allQuotes.size() > 0) {
			def randomIdx = new Random().nextInt(allQuotes.size())
			randomQuote = allQuotes[randomIdx]
		} else {
			randomQuote = getStaticQuote()
		}
		
		return randomQuote
	}
}
