package br.edu.ufabc.leocaliza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufabc.leocaliza.entity.Branch;
import br.edu.ufabc.leocaliza.repository.BranchRepository;

@Service
public class BranchService {
  @Autowired
  BranchRepository branchRepository;

  public Branch save(Branch branch) {
    // if admim
    validateName(branch.getName());
    if(branch.getManager() == null)
      throw new NoManagerException();
    return branchRepository.save(branch);
  }

  public Branch update(Branch branch) {
    branchRepository.findById(branch.getId())
      .orElseThrow(new BranchNotFoundException());
    save(branch);
  }

}
