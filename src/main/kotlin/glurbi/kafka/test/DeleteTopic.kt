package glurbi.kafka.test

import org.apache.kafka.clients.admin.AdminClient
import java.util.*

class DeleteTopic {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val topicName = "test-topic"
            val properties = Properties()
            properties["bootstrap.servers"] = "localhost:9092"
            val adminClient = AdminClient.create(properties)
            val result = adminClient.deleteTopics(listOf(topicName))
            result.values()[topicName]!!.get()
            println("Topic deleted.")
            adminClient.close()
        }
    }
}

