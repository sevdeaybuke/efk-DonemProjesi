#apt install maven -y


mkdir -p /var/lib/elasticsearch
chown 777 -R  /var/lib/elasticsearch
rm -rf /var/lib/elasticsearch/*


docker-compose down
docker-compose up -d

