package glurbi.kafka.test

import org.apache.kafka.clients.admin.AdminClient
import org.apache.kafka.clients.admin.NewTopic
import java.util.*

class CreateTopic {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val topicName = "test-topic"
            val numPartitions = 10
            val replicationFactor = 1.toShort()
            val properties = Properties()
            properties["bootstrap.servers"] = "localhost:9092"
            val adminClient = AdminClient.create(properties)
            val topic = NewTopic(topicName, numPartitions, replicationFactor)
            val result = adminClient.createTopics(listOf(topic))
            result.all().get()
            println("Topic created.");
            adminClient.close()
        }
    }
}

