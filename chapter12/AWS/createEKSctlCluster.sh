#!/bin/bash
set -x
time eksctl create cluster \
--name ostock-dev-cluster \
--version 1.17 \
--region us-east-1 \
--nodegroup-name standard-workers \
--node-type m4.large \
--nodes 1 \
--nodes-min 1 \
--nodes-max 2 \
--managed
#--fargate \
