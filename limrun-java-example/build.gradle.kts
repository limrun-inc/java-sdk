plugins {
    id("limrun.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":limrun-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :limrun-java-example:run` to run `Main`
    // Use `./gradlew :limrun-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.configure_me_limrun_v1.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
