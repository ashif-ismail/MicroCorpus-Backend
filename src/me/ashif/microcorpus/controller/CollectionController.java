package me.ashif.microcorpus.controller;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Employee;
import me.ashif.microcorpus.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by almukthar on 28/7/16.
 */
@RestController
public class CollectionController {

    private CollectionService collectionService;

    @Autowired(required = true)
    @Qualifier(value = "collectionService")
    public void setCollectionService(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @RequestMapping(value = "/collection/add", method = RequestMethod.POST)
    public void addCollection(@ModelAttribute("collection") Collection collection) {
        this.collectionService.addCollection(collection);
    }
    @RequestMapping(value = "/collections", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Collection>> getAllEmployees(){
        List<Collection> collections = collectionService.getAllCollection();
        if(collections.isEmpty())
        {
            return new ResponseEntity<List<Collection>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Collection>>(collections, HttpStatus.OK);
    }

}
