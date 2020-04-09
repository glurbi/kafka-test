load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_library", "kt_jvm_binary")

kt_jvm_library(
    name = "kafka-test-library",
    srcs = glob(["*.kt"]),
)

kt_jvm_binary(
    name = "kafka-test-binary",
    srcs = glob(["*.kt"]),
    main_class = "Main",
    visibility = ["//visibility:public"],
    deps = [
        "//:kafka-test-library",
        "@maven//:org_apache_kafka_kafka_clients",
    ],
)
