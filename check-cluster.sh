#!/bin/bash
for i in `seq 1 10`;
        do
            curl http://wildfly-fabric8.vagrant.f8/api/greet/fabric8
            sleep 5
            echo
        done
