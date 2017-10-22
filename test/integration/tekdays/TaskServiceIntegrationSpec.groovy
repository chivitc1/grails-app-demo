package tekdays

import grails.test.spock.IntegrationSpec

class TaskServiceIntegrationSpec extends IntegrationSpec {

	def taskService
	
    def setup() {
		new TekUser(fullName: 'Tammy Tester', userName: 'tester', 
				email: 'tester@example.com', website:'example.com',
				bio: 'A test person').save()
    }

    def cleanup() {
    }

    void "test addDefaultTasks"() {
		when: "web pass an event to taskService.addDefaultTasks"
		def e = new TekEvent(name: 'Test Event',
						city: 'TestCity, VN',
						description: 'Test description',
						organizer: TekUser.findByUserName('tester'),
						venue: 'TestCenter',
						startDate: new Date(),
						endDate: new Date() + 1)
		taskService.addDefaultTasks(e)
		then: "the event will have 6 default tasks"
		e.tasks.size() == 6
    }
}
