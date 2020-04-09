package glurbi.kafka.test

import org.apache.kafka.clients.admin.AdminClient
import org.apache.kafka.clients.admin.NewTopic
import java.util.*


class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val properties = Properties()
            properties["bootstrap.servers"] = "localhost:9092"
            properties["group.id"] = "test"
            properties["enable.auto.commit"] = "true"
            properties["auto.commit.interval.ms"] = "1000"
            properties["key.deserializer"] = "org.apache.kafka.common.serialization.StringDeserializer"
            properties["value.deserializer"] = "org.apache.kafka.common.serialization.StringDeserializer"
            val adminClient = AdminClient.create(properties)
            val newTopic = NewTopic("topicName", 1, 1.toShort())
            val newTopics: MutableList<NewTopic> = ArrayList<NewTopic>()
            newTopics.add(newTopic)
            adminClient.createTopics(newTopics)
            adminClient.close()
            println("Topic created");
        }
    }
}

