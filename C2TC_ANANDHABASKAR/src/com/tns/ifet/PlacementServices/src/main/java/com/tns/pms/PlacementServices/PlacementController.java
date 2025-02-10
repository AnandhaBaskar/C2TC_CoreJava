package com.tns.pms.PlacementServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/placement")
public class PlacementController {
	
	 @Autowired
	    private Placementservice placementService;

	    // Get all placements
	    @GetMapping
	    public List<Placement> getAllPlacements() {
	        return placementService.getAllPlacements();
	    }

	    // Get placement by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Placement> getPlacementById(@PathVariable Long id) {
	        Placement placement = placementService.getPlacementById(id);
	        return placement != null ? ResponseEntity.ok(placement) : ResponseEntity.notFound().build();
	    }

	    // Add new placement
	    @PostMapping
	    public ResponseEntity<Placement> addPlacement(@RequestBody Placement placement) {
	        Placement savedPlacement = placementService.addPlacement(placement);
	        return ResponseEntity.ok(savedPlacement);
	    }

	    // Update existing placement
	    @PutMapping("/{id}")
	    public ResponseEntity<Placement> updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
	        Placement updatedPlacement = placementService.updatePlacement(id, placement);
	        return updatedPlacement != null ? ResponseEntity.ok(updatedPlacement) : ResponseEntity.notFound().build();
	    }

	    // Delete placement by ID
	    @DeleteMapping("/{id}")
	    public ResponseEntity<String> deletePlacement(@PathVariable Long id) {
	        String response = placementService.deletePlacement(id);
	        return ResponseEntity.ok(response);
	    }
	}
