#!/bin/bash

set -e

for d in */ ; do
    cd "$d"
    for f in $(ls | grep .java) ; do
        echo "Fixing $f ..."
        sed -i 's/public class/class/g' $f
    done
    cd ..
done