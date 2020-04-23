#/bin/bash

curl "localhost:8014/transaction/$1/$2" | python -m json.tool
