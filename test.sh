#/bin/bash

curl 'localhost:8014/listar' | python -m json.tool
