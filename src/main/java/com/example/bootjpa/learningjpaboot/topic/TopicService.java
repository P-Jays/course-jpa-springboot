package com.example.bootjpa.learningjpaboot.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
 
    @Autowired
    TopicRepository topicRepository;

     public List<Topic>getAllTopics(){
         List<Topic> topics = new ArrayList<>();
         topicRepository.findAll().forEach(topics::add);
         return topics;

     }

     public Topic getTopic(int id){
       return topicRepository.findById(id).orElse(null);
     }

    public void setTopic(Topic topic) {
       topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, int id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(int id) {
       topicRepository.deleteById(id);
    }
}
