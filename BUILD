load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library", "kt_jvm_binary")

kt_jvm_library(
    name = "kafka-test-library",
    srcs = glob(["**/*.kt"]),
    deps = [
        "@maven//:org_apache_kafka_kafka_clients",
    ],

)

kt_jvm_binary(
    name = "create-topic",
    srcs = glob(["**/*.kt"]),
    main_class = "glurbi.kafka.test.CreateTopic",
    visibility = ["//visibility:public"],
    deps = [
        "//:kafka-test-library",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)

kt_jvm_binary(
    name = "delete-topic",
    srcs = glob(["**/*.kt"]),
    main_class = "glurbi.kafka.test.DeleteTopic",
    visibility = ["//visibility:public"],
    deps = [
        "//:kafka-test-library",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)

kt_jvm_binary(
    name = "compute-sum",
    srcs = glob(["**/*.kt"]),
    main_class = "glurbi.kafka.test.ComputeSum",
    visibility = ["//visibility:public"],
    deps = [
        "//:kafka-test-library",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
