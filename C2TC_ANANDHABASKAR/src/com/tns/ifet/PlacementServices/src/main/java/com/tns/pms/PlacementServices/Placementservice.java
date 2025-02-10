package com.tns.pms.PlacementServices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class Placementservice {
	@Autowired
    private PlacementRepository placementRepository;

    // Get All Placements
    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    // Get Placement By ID
    public Placement getPlacementById(Long id) {
        return placementRepository.findById(id).orElse(null);
    }

    // Add New Placement
    public Placement addPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    // Update Existing Placement
    public Placement updatePlacement(Long id, Placement placementDetails) {
        Optional<Placement> optionalPlacement = placementRepository.findById(id);
        if (optionalPlacement.isPresent()) {
            Placement placement = optionalPlacement.get();
            placement.setCompanyName(placementDetails.getCompanyName());
            placement.setJobRole(placementDetails.getJobRole());
            placement.setJobLocation(placementDetails.getJobLocation());
            placement.setSalaryPackage(placementDetails.getSalaryPackage());
            placement.setInterviewDate(placementDetails.getInterviewDate());
            placement.setApplicationDeadline(placementDetails.getApplicationDeadline());
            placement.setStatus(placementDetails.getStatus());
            return placementRepository.save(placement);
        }
        return null;
    }

    // Delete Placement By ID
    public String deletePlacement(Long id) {
        if (placementRepository.existsById(id)) {
            placementRepository.deleteById(id);
            return "Placement record deleted successfully!";
        } else {
            return "Placement record not found!";
        }
    }
}