# kafka-test

Let's play with kafka

# prerequisites

[bazel](https://bazel.build/)

[docker](https://www.docker.com/)

# build

```bazel build kafka-test-binary```

# run

start kafka:
```docker-compose up```

start test application
```bazel run kafka-test-binary```
