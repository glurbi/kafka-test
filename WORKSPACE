workspace(name = "kafka_test")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_jvm_external_tag = "3.2"
rules_jvm_external_sha = "82262ff4223c5fda6fb7ff8bd63db8131b51b413d26eb49e3131037e79e324af"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % rules_jvm_external_tag,
    sha256 = rules_jvm_external_sha,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % rules_jvm_external_tag,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

load("@rules_jvm_external//:specs.bzl", "maven")

maven_install(
    artifacts = [
        "org.apache.kafka:kafka-clients:2.4.1",
    ],
    repositories = [
        "https://repo.maven.apache.org/maven2/",
        "https://jcenter.bintray.com/",
        "https://cognite.jfrog.io/cognite/libs-release-local/",
    ],
    fetch_sources = True,
    strict_visibility = True,
    version_conflict_policy = "pinned", # default is just plain stupid
    maven_install_json = "@kafka_test//:maven_install.json",
)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()

rules_kotlin_version = "legacy-1.3.0"

rules_kotlin_sha = "4fd769fb0db5d3c6240df8a9500515775101964eebdf85a3f9f0511130885fde"

http_archive(
    name = "io_bazel_rules_kotlin",
    urls = ["https://github.com/bazelbuild/rules_kotlin/archive/%s.zip" % rules_kotlin_version],
    type = "zip",
    strip_prefix = "rules_kotlin-%s" % rules_kotlin_version,
    sha256 = rules_kotlin_sha,
)

load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kotlin_repositories", "kt_register_toolchains")

kotlin_repositories()

kt_register_toolchains()
