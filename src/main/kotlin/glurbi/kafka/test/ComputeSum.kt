package glurbi.kafka.test

import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import java.util.*


class ComputeSum {
    companion object {

        val topicName = "test-topic"

        @JvmStatic
        fun main(args: Array<String>) {
            bootstrap();
        }

        private fun bootstrap() {
            val producer = getProducer()
            for (i in 1..10) {
                val record = ProducerRecord(topicName, "" + i, i.toLong())
                producer.send(record);
            }
        }

        private fun getProducer(): KafkaProducer<String, Long> {
            val properties = Properties()
            properties["bootstrap.servers"] = "localhost:9092"
            properties["schema.registry.url"] = "localhost"
            properties["key.serializer"] = "org.apache.kafka.common.serialization.StringSerializer"
            properties["value.serializer"] = "org.apache.kafka.common.serialization.LongSerializer"
            return KafkaProducer<String, Long>(properties)
        }
    }
}

