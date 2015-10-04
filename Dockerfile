FROM shippable/minv2

ADD . /home/shippable/sample_clojure

RUN cd /home/shippable/sample_clojure && mkdir -p shippable/testresults && mkdir -p shippable/codecoverage 
