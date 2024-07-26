## Interview Technical

### 1. Use `docker compose up` to start mongo container
### 2. Compile and run Springboot application via maven
### 3. cURL commands to `localhost:8080` will invoke HelperService `print1()` and `print2()`

```shell
# School Files
curl -s -X POST http://localhost:8080/SchoolFile -H "Content-Type: application/json" -d '{"fileIds": ["1"], "collectionName": "schoolFiles" }'
# Work Files
curl -s -X POST http://localhost:8080/WorkFile -H "Content-Type: application/json" -d '{"name": ["9"], "collectionName": "workFiles" }'
```

### 4. Output of `print1()` and `print2()`

```log
File ID is1
File ID is9
```