## Usage:
```$xslt
git clone https://github.com/shashiCoderDattebayo/GradleModelServiceTemplate.git
```
Now open the project using intellij and save it as a template for future usage.
https://www.jetbrains.com/help/idea/saving-project-as-template.html#save-as-template
```$xslt
cd newProject
```

Now create a new project in intellij with the saved GradleModelServiceTemplate.

```
cd newProject
./gradlew build
./gradlew customFatJar
java -jar build/libs/all-in-one-jar.jar sampleData.json
```

## Debug Logs:
```
cd newProject
tail -f logs/log.out
```